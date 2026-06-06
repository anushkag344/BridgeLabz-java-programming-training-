import java.lang.annotation.*;
import java.lang.reflect.*;

// 1. Custom Annotation: ImportantTask
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantTask {
    String value() default "Important Work";
}

// 2. Custom Annotation: DeveloperInfo
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface DeveloperInfo {
    String name();
    String date();
}

// Class using DeveloperInfo
@DeveloperInfo(name = "Anushka Gupta", date = "06-06-2026")
class TaskManager {

    @ImportantTask("Complete project report")
    public void completeReport() {
        System.out.println("Project report completed");
    }

    public void normalTask() {
        System.out.println("Normal task completed");
    }

    @ImportantTask("Attend client meeting")
    public void attendMeeting() {
        System.out.println("Client meeting attended");
    }
}

// Demonstrating built-in annotations
class Parent {
    public void showMessage() {
        System.out.println("This is parent class method");
    }
}

class Child extends Parent {

    @Override
    public void showMessage() {
        System.out.println("This is child class method");
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This method is old and should not be used");
    }

    public void useOldMethod() {
        oldMethod();
    }
}

public class AnnotationDemo {

    public static void main(String[] args) throws Exception {

        System.out.println("---- Important Tasks using Reflection ----");

        TaskManager manager = new TaskManager();

        Method[] methods = manager.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantTask.class)) {
                ImportantTask task = method.getAnnotation(ImportantTask.class);

                System.out.println("Task Method: " + method.getName());
                System.out.println("Task Description: " + task.value());

                method.invoke(manager);
                System.out.println();
            }
        }

        System.out.println("---- Built-in Annotations Demo ----");

        Child child = new Child();

        child.showMessage();     // @Override
        child.useOldMethod();    // @Deprecated + @SuppressWarnings

        System.out.println();

        System.out.println("---- DeveloperInfo using Reflection ----");

        Class<?> cls = TaskManager.class;

        if (cls.isAnnotationPresent(DeveloperInfo.class)) {
            DeveloperInfo info = cls.getAnnotation(DeveloperInfo.class);

            System.out.println("Class Name: " + cls.getSimpleName());
            System.out.println("Developer Name: " + info.name());
            System.out.println("Date: " + info.date());
        }
    }
}