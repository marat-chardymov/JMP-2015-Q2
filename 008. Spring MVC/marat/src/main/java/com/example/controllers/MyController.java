package com.example.controllers;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.exceptions.CustomGenericException;
import com.example.model.Student;
import com.example.services.AsyncService;

@Controller
public class MyController
{

  private static final Logger logger = Logger.getLogger( MyController.class );

  @Autowired
  private AsyncService asyncService;

  @RequestMapping("/")
  public String greeting(
    @RequestParam(value = "name", required = false, defaultValue = "World") String name,
    Model model )
  {
    model.addAttribute( "name", name );
    return "greeting";
  }

  @RequestMapping("/{pathParam}")
  public String pathParam( @PathVariable String pathParam, Model model )
  {
    model.addAttribute( "pathParam", pathParam );
    return "pathParam";
  }

  @RequestMapping(value = "/students/add")
  public String addStudentPage( Model model )
  {
    Student student = new Student();
    model.addAttribute( "studentForm", student );
    return "postForm";
  }

  @RequestMapping(value = "/postWithForm", method = RequestMethod.POST)
  public String postWithForm(
    @Validated(Student.ValidationTwo.class) @ModelAttribute("studentForm") Student student,
    BindingResult bindingResult, ModelMap model, HttpServletResponse response )
  {
    if ( bindingResult.hasErrors() ) {
      model.addAttribute( "inputErrors", "input data is incorrect" );
      response.setStatus( HttpServletResponse.SC_BAD_REQUEST );
      return "postForm";
    }
    model.addAttribute( "name", student.getName() );
    model.addAttribute( "age", student.getAge() );
    model.addAttribute( "id", student.getId() );

    return "formResults";
  }

  @RequestMapping(value = "/asyncCall")
  public String asyncCall()
  {
    asyncService.asyncOperation();
    logger.debug( "async request completed" );
    return "async";
  }

  @RequestMapping(value = "/throwException")
  protected ModelAndView throwException()
    throws Exception
  {
    throw new CustomGenericException( "9000", "This is error message" );
  }

  @ExceptionHandler(CustomGenericException.class)
  public ModelAndView handleCustomException( CustomGenericException ex )
  {
    ModelAndView model = new ModelAndView( "error/generic_error" );
    model.addObject( "exception", ex );
    return model;
  }

}