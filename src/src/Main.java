package src;

import src.controllers.CourseController;
import src.models.CourseModel;
import src.views.CourseView;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CourseModel model = retriveCourseFromDatabase();
        CourseView view = new CourseView();
        CourseController controller = new CourseController(model, view);
        controller.updateView();
        controller.setCourseName("Python");
        controller.updateView();

    }
    private static CourseModel retriveCourseFromDatabase(){
        CourseModel course = new CourseModel();
        course.setCourseName("Java");
        course.setCourseId(1);
        course.setCourseCategory("Programming");
        return course;
    }
}
