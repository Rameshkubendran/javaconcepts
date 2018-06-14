package HascodeandEqual;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class Tiger {

                private String color;
                private String stripePattern;
                private int height;

                @Override
                public boolean equals(Object object) {
                                boolean result = false;
                                if (object == null || object.getClass() != getClass()) {
                                                result = false;
                                } else {
                                                Tiger tiger = (Tiger) object;
                                               /* if (this.color == tiger.getColor()
                                                                                && this.stripePattern == tiger.getStripePattern()) {
                                                                result = true;
                                                }*/
                                                if(this.color == tiger.getColor())
                                                	 result = true;
                                }
                                return result;
                }

                // just omitted null checks
               @Override
                public int hashCode() {
                               /* int hash = 3;
                                System.out.println("==>"+this.color.hashCode());

                                hash = 7 * hash + this.color.hashCode();

                                hash = 7 * hash + this.stripePattern.hashCode();
*/
                                return this.color.hashCode();
                }

                public static void main(String args[]) {
                                Tiger bengalTiger1 = new Tiger("Yellow", "Dense", 2);
                                Tiger bengalTiger2 = new Tiger("Yellow", "Dense1", 3);
                                Tiger siberianTiger = new Tiger("White", "Sparse", 4);
                                System.out.println("bengalTiger1 and bengalTiger2: "
                                                                + bengalTiger1.equals(bengalTiger2));
                                System.out.println("bengalTiger1 and siberianTiger: "
                                                                + bengalTiger1.equals(siberianTiger));
                                
                                Set<Tiger> sets=new HashSet<Tiger>();
                                sets.add(bengalTiger1);
                                sets.add(bengalTiger2);
                                sets.add(siberianTiger);
                                
                                System.out.println("sets==>"+sets);
                                
                                

                                System.out.println("bengalTiger1 hashCode: " + bengalTiger1.hashCode());
                                System.out.println("bengalTiger2 hashCode: " + bengalTiger2.hashCode());
                                System.out.println("siberianTiger hashCode: "
                                                                + siberianTiger.hashCode());
                               
                                
                }

                public String getColor() {
                                return color;
                }

                public int getHeight() {
					return height;
				}

				public void setHeight(int height) {
					this.height = height;
				}

				public String getStripePattern() {
                                return stripePattern;
                }

                public Tiger(String color, String stripePattern, int height) {
                                this.color = color;
                                this.stripePattern = stripePattern;
                                this.height = height;

                }
                
                
                
}
