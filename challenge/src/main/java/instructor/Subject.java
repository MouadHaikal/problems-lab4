package instructor;


public class Subject{
    private int id;
    private String code;
    private String title;

    public String normalizedCode(){
        StringBuilder out = new StringBuilder();

        for(int i = 0; i < code.length(); ++i){
            Character c = code.charAt(i);
            if(!c.equals(' ')) out.append(c);
        }

        return out.toString().toUpperCase();
    }

    public String properTitle() {
        if (title.isEmpty()) return title; 

        StringBuilder builder = new StringBuilder();
        String[] words = title.split(" ");

        for (String word : words) {
            if (word.isEmpty()) continue;

            builder.append(Character.toUpperCase(word.charAt(0)));

            if (word.length() > 1) builder.append(word.substring(1).toLowerCase());
            builder.append(" ");
        }

        return builder.toString().trim();
    }

    public boolean isIntroCourse(){
        return title.contains("Intro") || code.startsWith("INTRO-");
    }

    public String syllabusLine(Instructor instructor){
        StringBuilder builder = new StringBuilder();

        builder.append(code)
               .append(" - ")
               .append(title)
               .append("(Instructor: ")
               .append(instructor.getSecondName())
               .append(" ")
               .append(instructor.getFirstName());

        return builder.toString();
    }
}
