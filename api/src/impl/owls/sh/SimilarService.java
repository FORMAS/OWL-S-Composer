package impl.owls.sh;

import java.util.ArrayList;
import impl.owls.sh.Degree;
import pf.matcher.implementations.functional.SimilarityDegree;

public class SimilarService implements Comparable<SimilarService> {
	
	public Degree degree;
	public String path;
	public ArrayList<SimilarityDegree> inputList;
	public ArrayList<SimilarityDegree> outputList;

	public SimilarService(String path, Degree degree) {
		this.degree = degree;
		this.path = path;
	}

	@Override
	public int compareTo(SimilarService o) {
		if (o.degree.ordinal() > degree.ordinal())
			return 1;
		else if (o.degree.ordinal() == degree.ordinal())
			return 0;
		else
			return -1;
	}
	
}
