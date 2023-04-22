package class11;

public class OOPs {
    public static void main(String[] args) {
        String [] [] student = {
                {"name: Mike", "name:Bob", "name:Eva", "name:Asel", "name:Mat"},
                {"ID: 050566700396", "ID: 050566700456", "ID: 0505667009456", "ID: 050116700456", "ID: 05056670126"},
                {"age: 16", "age: 17", "age: 18", "age: 15", "age: 16"},
                {"grade: 9", "grade: 8", "grade: 10", "grade: 9", "grade: 9"},
                {"weight: 60kg", "weight: 60kg", "weight: 60kg", "weight: 60kg"}
            };
        for (String[] strings : student) {
            for (String string : strings) {
                System.out.println(string);
            }


        }



    }
}
