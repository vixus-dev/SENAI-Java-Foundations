module Classroom_9 {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.base;

	opens application to javafx.graphics, javafx.fxml;
	
	exports application;
}
