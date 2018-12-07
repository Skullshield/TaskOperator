package Classes;

import Interfaces.IDefiningClasses;

import javax.ws.rs.core.Response;

public class DefiningClassesService implements IDefiningClasses {


    public Response processTask(String taskName) {
        // can it be done better?
        TaskOutput output = new TaskOutput();
        String taskResult;
        switch (taskName) {
            case "DefinePerson":
                taskResult = runDefineClassPerson();
                output.setOutput(taskResult);
                break;
            case "CreateConstructors":
                taskResult = runCreatingConstructors();
                output.setOutput(taskResult);
                break;

                default:
                    output.setOutput("Sorry, there is no such task!");
                    break;
        }
        return Response.ok().entity(output).build();

    }

    private String runDefineClassPerson(){
        return "Define Class Person Task Solved!";
    }

    private String runCreatingConstructors(){
        return "CreatingConstructors Task solved!:";
    }
}
