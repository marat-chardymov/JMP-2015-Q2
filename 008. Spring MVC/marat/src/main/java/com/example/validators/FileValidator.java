package com.example.validators;

import com.example.model.File;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class FileValidator
  implements Validator
{
  public boolean supports( Class<?> paramClass )
  {
    return File.class.equals( paramClass );
  }

  public void validate( Object obj, Errors errors )
  {
    File file = (File)obj;
    if ( file.getFile().getSize() == 0 || !file.getFile().getContentType().equalsIgnoreCase("image/jpeg")) {
      errors.rejectValue( "file", "valid.file" );
    }
  }
}