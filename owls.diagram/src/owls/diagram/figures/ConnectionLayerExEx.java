package owls.diagram.figures;

import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ConnectionLayerEx;

import owls.diagram.routers.OwlsBorderItemRectilinearRouter;

public class ConnectionLayerExEx extends ConnectionLayerEx{

	protected ConnectionRouter borderItemRectilinearRouter;
	
	public ConnectionLayerExEx() {
    }
	
	public ConnectionRouter getBorderItemRectilinearRouter() {
        if (borderItemRectilinearRouter == null)
        	borderItemRectilinearRouter = new OwlsBorderItemRectilinearRouter();

        return borderItemRectilinearRouter;
    }
}
