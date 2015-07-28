package com.example.services;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by Marat_Chardymau on 7/27/2015.
 */
@Component
public class AsyncService {

  private static final Logger logger = Logger.getLogger(AsyncService.class);

  @Async
  public void asyncOperation(){
    try {
      Thread.sleep(15000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    logger.debug("async operation completed");
  }
}
