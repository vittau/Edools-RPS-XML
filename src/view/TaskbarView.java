package view;

import controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Vitor on 05/11/2015.
 */
public class TaskbarView implements View {

	private final Controller controller;

	public TaskbarView(Controller controller) {
		this.controller = controller;
	}

	@Override public void dialog(String text) {
		//TODO: Implement simple text dialog.
	}

	@Override
	public void showMainView() {
		controller.startTimer();

		//TODO: Implement main view.

		//TODO: Stop the timer after receiving an alert of new payments.

		//TODO: Start the timer after generating an XML.
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//TODO: Implement actionPerformed.

	}
}
