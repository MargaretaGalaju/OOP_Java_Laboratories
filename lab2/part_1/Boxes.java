package OOP.lab2.part_1;


    public class Boxes {
        int height;
        int width;
        int depth;

        Boxes() {
            this.height = 1;
            this.width = 1;
            this.depth = 1;
            System.out.println("Constructor without parameters " + this.height + " " + this.width + " " + this.depth);

        }

        Boxes(int a) {
            this.height = a;
            this.depth = a;
            this.width = a;

            System.out.println("Constructor with one parameter: " + this.width + " " + this.height + " " + this.depth);
        }

        Boxes(int height, int depth, int width) {
            this.height = height;
            this.depth = depth;
            this.width = width;
            System.out.println("Constructor with three parameters: " + this.height + " " + this.depth + " " + this.width);

        }

        public float calculateArea() {
            float area = 2 * (height * width + height * depth + width * depth);
            return area;
        }

        public float calculateV() {
            float volume = height * width * depth;
            return volume;
        }
}