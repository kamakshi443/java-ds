package MileStone2.OOPS1;
// Polynomial Class Problem

// Send Feedback
// Implement a polynomial class, that contains following functions -
// 1. setCoefficient -
// This function sets coefficient for a particular degree value. If term with given degree is not there in the polynomial, then corresponding term (with specified degree and value) is added. If the term is already present in the polynomial, then previous coefficient value is replaced by given coefficient value.
// 2. add -
// Adds two polynomials and returns a new polynomial which has the result.
// 3. subtract -
// Subtracts two polynomials and returns a new polynomial which has the result.
// 4. multiply -
// Multiplies two polynomials and returns a new polynomial which has the result.
// 5. print -
// Prints all the terms (only terms with non zero coefficients are to be printed) in increasing order of degree.
// Print pattern for a single term : "x"
// And multiple terms should be printed separated by space. For more clarity, refer sample test cases.
// Note : Only keep those terms which have non - zero coefficients.
// Input Format:
// The first line of input contains count of the number of coefficients in polynomial 1(C1)
// The next line of input has C1 degrees for polynomial 1.
// The next line of input has C1 coefficients for polynomial 1.  
// The next line of input contains count of the number of coefficients in polynomial 2(C2)
// The next line of input has C2 degrees for polynomial 2.
// The next line of input has C2 coefficients for polynomial 2.  
// The next line of input has the choice for the function you want to implement.
// Output Format:
// The output will be printed in case of print function same as that of print function format.
// Sample Input 1 :
// P1 : 1x2 2x3 4x6 
// P2 : 3x4 1x2
// Sample Output 1 :
// P1 + P2 = 2x2 2x3 3x4 4x6
// Sample Input 2 :
// P1 : 1x2 2x3 4x6 
// P2 : 3x4 1x2
// Sample Output 2 :
// P1 - P2 = 2x3 -3x4 4x6

/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */

public class PolynomialClass {

    int arr[] = new int[100];

    /*
     * This function sets coefficient for a particular degree value, if degree is
     * not there in the polynomial
     * then corresponding term with specified degree and value is added int the
     * polynomial. If the degree
     * is already present in the polynomial then previous coefficient is replaced by
     * new coefficient value passed as function argument
     */
    public void setCoefficient(int degree, int coeff) {
        arr[degree] += coeff;
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed)
    // in increasing order of degree.
    public void print() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + "x" + i + " ");
            }
        }
    }

    // Adds two polynomials and returns a new polynomial which has result
    public PolynomialClass add(PolynomialClass p) {
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < p.arr.length; j++) {
                if (i == j && (this.arr[i] != 0 || p.arr[j] != 0)) {
                    this.arr[i] += p.arr[j];
                }
            }
        }
        return this;

    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public PolynomialClass subtract(PolynomialClass p) {
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < p.arr.length; j++) {
                if (i == j && (this.arr[i] != 0 || p.arr[j] != 0)) {
                    this.arr[i] -= p.arr[j];
                }
            }
        }
        return this;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public PolynomialClass multiply(PolynomialClass p) {
        PolynomialClass p1 = new PolynomialClass();
        for (int i = 0; i < this.arr.length / 2; i++) {
            for (int j = 0; j < p.arr.length / 2; j++) {
                p1.arr[(i + j)] += this.arr[i] * p.arr[j];
            }
        }
        return p1;
    }
}