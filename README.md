Quiz Application with Spring Boot

A lightweight Spring Boot application designed to serve quiz questions and answers, featuring email validation and password quality checks. It utilizes Thymeleaf templates and REST APIs for a dynamic user experience.

Key Features

Quiz REST API to deliver questions in JSON format.
Thymeleaf integration to render a responsive user interface for quizzes.
AJAX support for dynamically loading quiz content.
Tools for password quality checks and email validation.
Requirements

The following tools are required to run the application:

Java Development Kit (JDK) version 17 or higher.
Apache Maven version 3.6 or above.
Internet access to retrieve dependencies.
Project Organization

Java source files are located in src/main/java, containing controllers and models.
Templates for the user interface are found in src/main/resources/templates.
Static assets, like CSS for styling, are in src/main/resources/static/css.
Build configuration and project dependencies are defined in pom.xml.
Setup Instructions

Clone the repository and navigate to the project folder.
Build the application using Maven, and then run it.
Access the application in a web browser at http://localhost:8080 to begin using the quiz app.
Usage Guide

Interactive Quiz: Use the main page to access quizzes. Questions load dynamically for an improved user experience.
Validation Tools: Utilize the email and password validation features for additional functionality.
