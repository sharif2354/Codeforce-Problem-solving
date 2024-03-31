import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class antonandpholyhedron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Map<String, Integer> polyhedronFaces = new HashMap(); // map polyhedron names to number of faces
        polyhedronFaces.put("Tetrahedron", 4);
        polyhedronFaces.put("Cube", 6);
        polyhedronFaces.put("Octahedron", 8);
        polyhedronFaces.put("Dodecahedron", 12);
        polyhedronFaces.put("Icosahedron", 20);

        int totalFaces = 0;
        for (int i = 0; i < n; i++) {
            String polyhedron = scanner.next();
            totalFaces += polyhedronFaces.get(polyhedron);
        }

        System.out.println(totalFaces);
    }
    
}
