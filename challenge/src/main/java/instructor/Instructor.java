package instructor;

import student.Person;

public class Instructor extends Person {
    private String employeeNumber;


    public String cleanEmployeeNumber(){
        StringBuilder trimmedString = new StringBuilder();

        for(int i = 0; i < employeeNumber.length(); ++i){
            Character c = employeeNumber.charAt(i);
            if (!c.equals(' ')) trimmedString.append(c);
        }

        return trimmedString.toString();
    }

    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
            employeeNumber,
            this.secondName,
            this.firstName);
    }

    public String toCard() {
        StringBuilder builder = new StringBuilder();

        builder.append("Instructor \n----------\n");
        builder.append("Employee #: ").append(employeeNumber).append("\n");
        builder.append("Name      : ").append(secondName).append(", ").append(firstName).append("\n");
        builder.append("Email     : ").append(email).append("\n");
        builder.append("Phone     : ").append(phone).append("\n");

        return builder.toString();
    }

    public String displayName() {
        StringBuilder builder = new StringBuilder();

        if (!firstName.trim().isEmpty()) {
            builder.append(firstName);
            builder.append(" ");
        }

        if (!secondName.trim().isEmpty()) {
            builder.append(secondName);
            builder.append(" ");
        }

        return builder.toString();
    }
}
