## MVC Pattern

MVC Pattern stands for Model-View-Controller Pattern. This pattern is used to separate application's concerns.

Model - Model represents an object or JAVA POJO carrying data. It can also have logic to update controller if its data changes.

View - View represents the visualization of the data that com.company.model contains.

Controller - Controller acts on both com.company.model and view. It controls the data flow into com.company.model object and updates the view whenever data changes. It keeps view and com.company.model separate.