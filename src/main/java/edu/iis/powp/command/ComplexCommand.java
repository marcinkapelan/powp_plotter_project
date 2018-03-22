package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {
	private int x0;
	private int y0;
	private int x1;
	private int y1;
	
	public ComplexCommand(int x0, int y0, int x1, int y1) {
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
	}
	
	@Override
	public void execute(IPlotter plotter) {
		plotter.setPosition(x0, y0);
		plotter.drawTo(x1, y1);
		plotter.setPosition(x1, y1);
		plotter.drawTo(Math.abs(x0 - x1) / 2, Math.abs(x0 - x1));
	}
}
