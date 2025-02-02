import java.util.Scanner;

 class Rectangle {
    // Data fields to store width and height
    protected int width;
    protected int height;
  
    // Constructor to initialize width and height (can be overloaded for different use cases)
    public Rectangle(int width, int height) {
      this.width = width;
      this.height = height;
    }
  
    // Method to display width and height
    public void display() {
      System.out.println(width + " " + height);
    }
  }
  
   class RectangleArea extends Rectangle {
  
    // Constructor to call the base class constructor (can be overloaded for different use cases)
    public RectangleArea(int width, int height) {
      super(width, height); // Call parent class constructor
    }
  
    // Method to read input values for width and height (assuming Scanner is imported)
    public void read_input() {
      Scanner scanner = new Scanner(System.in);
      this.width = scanner.nextInt();
      this.height = scanner.nextInt();
      scanner.close();
    }
  
    // Overloaded display method to print area
    @Override
    public void display() {
      super.display(); // Call parent class display method
      System.out.println(width * height);
    }
  }
  
   class Main { // Separate class for main method (optional)
  
    public  static void main(String[] args) {
      // Create a RectangleArea object
      RectangleArea rectArea = new RectangleArea(0, 0); // Initial values can be 0
  
    //  rectArea.display();

      // Read width and height from user input
      rectArea.read_input();
  
      // Display width, height, and area
      rectArea.display();
    }
  }
  