package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class MainController {
	
	@FXML
	private Label outputLabel;
	@FXML
	private Label equationLabel;
	private long number1 = 0;
	private String operator = "";
	private boolean start = true;
	private Calculations model = new Calculations();
	
	@FXML
	public void numbers(ActionEvent event) {
		
		if (start) {
			outputLabel.setText("");
			start = false;
		}
		
		String numberValue = ((Button)event.getSource()).getText();
		outputLabel.setText(outputLabel.getText()+numberValue);
		
	}
	
	@FXML
	public void operators(ActionEvent event) {
		
		String operatorValue = ((Button)event.getSource()).getText();
		
		if(operatorValue.equals("C")) {
			
			outputLabel.setText("");
			operator = "";
			start = true;
			
		}
		else {
			
			if(!operatorValue.equals("=")) {
				if(!operator.isEmpty())
				{
					return;
				}
				
				operator = operatorValue;
				number1 = Long.parseLong(outputLabel.getText());
				outputLabel.setText("");
			}
			else {
				if(operator.isEmpty()) {
					return;
				}

				long number2 = Long.parseLong(outputLabel.getText());
				if(number2 == 0) {
					String output = "Divided by zero!";
					outputLabel.setText(output);
					operator = "";
					start = true;
				}
				else {
					float output = model.Calculate(number1, number2, operator);
					outputLabel.setText(String.valueOf(number1 + " " + operator + " " + number2 + " = " + output));
					operator = "";
					start = true;		
				}
				
			}
		}			
	}
}
