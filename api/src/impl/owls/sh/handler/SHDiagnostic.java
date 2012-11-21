package impl.owls.sh.handler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mindswap.query.ValueMap;

import pf.main.MainFunctionalMatcher;
import pf.matcher.implementations.functional.SimilarityDegree;

import impl.owls.sh.Degree;
import impl.owls.sh.ObjectRequest;
import impl.owls.sh.SHHandler;
import impl.owls.sh.SimilarService;

public abstract class SHDiagnostic extends SHHandler {

	public SHDiagnostic(SHHandler successHandler) {
		super(successHandler);
	}

	public ValueMap handleHealing(ObjectRequest objectRequest) {
		ValueMap result = null;
		if (canExecute(objectRequest))
			result = execute(objectRequest);
		System.out.println("next: " + result);
		if (result == null)
			result = super.handleHealing(objectRequest);

		return result;
	}

	public abstract ValueMap execute(ObjectRequest objectRequest);

	public abstract boolean canExecute(ObjectRequest objectRequest);

	protected String getEquivalentURI(String processURI, String directoryPath,
			Degree degree) {
		MainFunctionalMatcher matcher = new MainFunctionalMatcher();
		List<pf.vo.Service> servicesDiscovered = null;
		Map<String, ArrayList<SimilarityDegree>> resultInput = new HashMap<String, ArrayList<SimilarityDegree>>();
		Map<String, ArrayList<SimilarityDegree>> resultOutput = new HashMap<String, ArrayList<SimilarityDegree>>();

		try {
			// TODO Colocar aqui o path correto
			processURI.split("/");
			// String directoryPath = "http://localhost:8080/axis/wsFinal/";
			System.out.println("DIRECTORY: " + directoryPath);
			servicesDiscovered = matcher.discoverServices(processURI,
					directoryPath);
			resultInput = matcher.getResultInputs();
			resultOutput = matcher.getResultOutputs();
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<SimilarService> serviceList = new ArrayList<SimilarService>();
		for (pf.vo.Service service : servicesDiscovered) {
			if (degree.equals(Degree.EXACT)) {
				if (service.getDegreeMatch().equals("EXACT")) {
					SimilarService newService = new SimilarService(service
							.getUri().getRawPath(), Degree.EXACT);
					newService.inputList = resultInput.get(service.getUri()
							.toString());
					newService.outputList = resultOutput.get(service.getUri()
							.toString());
					serviceList.add(newService);
				}
			} else{
				if (service.getDegreeMatch().equals("PLUGIN")) {
					SimilarService newService = new SimilarService(service
							.getUri().getRawPath(), Degree.PLUGIN);
					newService.inputList = resultInput.get(service.getUri()
							.toString());
					newService.outputList = resultOutput.get(service.getUri()
							.toString());
					serviceList.add(newService);
				} else if (service.getDegreeMatch().equals("SUBSUMES")) {
					SimilarService newService = new SimilarService(service
							.getUri().getRawPath(), Degree.SUBSUMES);
					newService.inputList = resultInput.get(service.getUri()
							.toString());
					newService.outputList = resultOutput.get(service.getUri()
							.toString());
					serviceList.add(newService);
				} else if (service.getDegreeMatch().equals("SIBLING")) {
					SimilarService newService = new SimilarService(service
							.getUri().getRawPath(), Degree.SIBLING);
					newService.inputList = resultInput.get(service.getUri()
							.toString());
					newService.outputList = resultOutput.get(service.getUri()
							.toString());
					serviceList.add(newService);
				}
			}
		}

		// Sort serviceList by degree
		Collections.sort(serviceList);
		System.out.println("SERVICES DISCOVERED FOR " + processURI + ":");

		for (SimilarService similarService : serviceList) {
			System.out.println(similarService.path + " - "
					+ similarService.degree);
		}

		if (serviceList.size() > 0)
			return serviceList.get(0).path;

		return "";
	}

}
