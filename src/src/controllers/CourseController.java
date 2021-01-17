package src.controllers;

import src.models.CourseModel;
import src.views.CourseView;

public class CourseController {
    private CourseModel model;
    private CourseView view;

    public CourseController(CourseModel model, CourseView view){
        this.model = model;
        this.view = view;
    }

    public void setCourseName(String name){
        this.model.setCourseName(name);
    }
    public String getCourseName(){
        return this.model.getCourseName();
    }

    public void setCourseId(int id){
        this.model.setCourseId(id);
    }
    public int getCourseId(){
        return this.model.getCourseId();
    }
    public void setCourseCategory(String category){
        this.model.setCourseCategory(category);
    }
    public String getCourseCategory(){
        return this.model.getCourseCategory();
    }
    public void updateView(){
        view.printCourseView(model.getCourseId(), model.getCourseName(), model.getCourseCategory());
    }

}

