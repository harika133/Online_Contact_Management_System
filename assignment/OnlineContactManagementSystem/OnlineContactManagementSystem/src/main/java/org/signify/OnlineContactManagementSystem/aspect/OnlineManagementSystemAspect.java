package org.signify.OnlineContactManagementSystem.aspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OnlineManagementSystemAspect {


        @After("execution(* saveContactDetail(..))")
        public void afterSaveContact() {
            System.out.println("Contact details created successfully");
        }
        @After("execution(* updateContactDetail(..))")
        public void afterUpdateContact() {
            System.out.println("Contact details updated successfully");
        }
    }


