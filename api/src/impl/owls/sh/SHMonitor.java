package impl.owls.sh;

import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owls.grounding.AtomicGrounding;
import org.mindswap.query.ValueMap;

import impl.owls.sh.handler.KindFault;
import impl.owls.sh.handler.ReplaceByEqual;
import impl.owls.sh.handler.ReplaceByEqualInCloud;
import impl.owls.sh.handler.ReplaceByEquivalent;
import impl.owls.sh.handler.ReplaceByEquivalentInCloud;
import impl.owls.sh.handler.Retry;
import impl.owls.sh.handler.SkipOptionalService;

public class SHMonitor {
	
	private static SHMonitor instance;
	private SHHandler shHandler;
	
	public SHMonitor() {
		SkipOptionalService skipOptionalService = new SkipOptionalService(null); 
		ReplaceByEquivalent replaceByEquivalent = new ReplaceByEquivalent(skipOptionalService);
		ReplaceByEquivalentInCloud replaceByEquivalentInCloud = new ReplaceByEquivalentInCloud(replaceByEquivalent);
		ReplaceByEqual replaceByEqual = new ReplaceByEqual(replaceByEquivalentInCloud);
		ReplaceByEqualInCloud replaceByEqualInCloud = new ReplaceByEqualInCloud(replaceByEqual);
		shHandler = new Retry(replaceByEqualInCloud);
	}
	
	public static SHMonitor getInstance() {
		if (instance == null)
			instance = new SHMonitor();
		
		return instance;
	}
	
	public ValueMap handleHealing(AtomicGrounding grounding, OWLKnowledgeBase env, CloudKnowledgeBase cloud, ValueMap values, String exception) {
		
		ObjectRequest objectRequest = new ObjectRequest();
		objectRequest.setGrounding(grounding);
		objectRequest.setKb(env);
		objectRequest.setCB(cloud);
		objectRequest.setValues(values);
		objectRequest.setKind(getRightKingFault(exception));
		
		return shHandler.handleHealing(objectRequest);
	}
	
	private KindFault getRightKingFault(String exception) {
		if (exception.contains("Bad types"))
			return KindFault.TYPE;
		else if (exception.contains("No such operation"))
			return KindFault.OPERATION;
		else if (exception.contains("Read timed out"))
			return KindFault.TIMEOUT;
		else
			return KindFault.OTHER;
	}
}
