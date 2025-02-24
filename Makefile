JAVAFX_LIB = C:/Users/enyar/Downloads/openjfx-23.0.2_windows-x64_bin-sdk/javafx-sdk-23.0.2/lib
MODULES = javafx.controls,javafx.fxml
SOURCES = Main.java Controller.java
TARGET = Main

compile: 
	javac --module-path $(JAVAFX_LIB) --add-modules $(MODULES) $(SOURCES)

run: 
	java --module-path $(JAVAFX_LIB) --add-modules $(MODULES) $(TARGET)

clean: 
	rm -f *.class
