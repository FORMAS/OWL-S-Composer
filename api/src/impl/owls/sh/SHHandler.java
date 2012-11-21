package impl.owls.sh;

import org.mindswap.query.ValueMap;

public abstract class SHHandler {
	
	protected SHHandler successor;
	
	public SHHandler(SHHandler successHandler) {
		this.successor = successHandler;
	}
	
	protected ValueMap handleHealing(ObjectRequest objectRequest) {
		System.out.println("indo p o proximo");
		if (this.successor != null)
			return this.successor.handleHealing(objectRequest);
		
		return null;
	}	
}
