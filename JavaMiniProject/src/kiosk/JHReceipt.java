package kiosk;
            
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;


            
class Product {
	private String productName;
	public String productName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
    public static int getPrice(String productName) {
    	 switch (productName) {
         case "불고기버거":
             return SHMenu2.burgerPrice[0];
         case "불고기버거세트":
         	return SHMenu2.setPrice[0];
         case "치즈버거":
             return SHMenu2.burgerPrice[1];
         case "치즈버거세트":
        	 return SHMenu2.setPrice[1];
         case "새우버거":
             return SHMenu2.burgerPrice[2];
         case "새우버거세트":
        	 return SHMenu2.setPrice[2];
         case "치킨버거":
             return SHMenu2.burgerPrice[3];
         case "치킨버거세트":
        	 return SHMenu2.setPrice[3];         	
         case "베이컨치즈버거":
             return SHMenu2.burgerPrice[4];
         case "베이컨치즈버거세트":
        	 return SHMenu2.setPrice[4];
         case "더블비프치즈버거":
             return SHMenu2.burgerPrice[5];
         case "더블비프치즈버거세트":
        	 return SHMenu2.setPrice[5];
         case "스페셜버거":
        	 return SHMenu2.burgerPrice[6];
         case "스페셜버거세트":
        	 return SHMenu2.setPrice[6];
         case "콜라(R)":
             return SHMenu2.drinkPrice[0];
         case "콜라(L)":
             return SHMenu2.drinkSizeUpPrice[0];
         case "사이다(R)":
             return SHMenu2.drinkPrice[1];
         case "사이다(L)":
             return SHMenu2.drinkSizeUpPrice[1];
         case "아이스티(R)":
             return SHMenu2.drinkPrice[2];
         case "아이스티(L)":
             return SHMenu2.drinkSizeUpPrice[2];
         case "아메리카노(R)":
             return SHMenu2.drinkPrice[3];
         case "아메리카노(L)":
             return SHMenu2.drinkSizeUpPrice[3];
         case "레몬에이드(R)":
             return SHMenu2.drinkPrice[4];
         case "레몬에이드(L)":
             return SHMenu2.drinkSizeUpPrice[4];
         case "우유(R)":
             return SHMenu2.drinkPrice[5];
         case "우유(L)":
             return SHMenu2.drinkSizeUpPrice[5];
         case "핫초코(R)":
             return SHMenu2.drinkPrice[6];
         case "핫초코(L)":
             return SHMenu2.drinkSizeUpPrice[6];
         case "생수(R)":
             return SHMenu2.drinkPrice[7];
         case "생수(L)":
             return SHMenu2.drinkSizeUpPrice[7];
         case "음료 X":
        	 return SHMenu2.drinkPrice[8];
         case "프렌치프라이":
             return SHMenu2.sideMenuPrice[0];
         case "양념감자":
             return SHMenu2.sideMenuPrice[1];
         case "치즈스틱":
        	 return SHMenu2.sideMenuPrice[2];
         case "치킨너겟":
        	 return SHMenu2.sideMenuPrice[3];
         case "오징어링":
        	 return SHMenu2.sideMenuPrice[4];
         case "콘샐러드":
        	 return SHMenu2.sideMenuPrice[5];
         case "사이드 X":
        	 return SHMenu2.sideMenuPrice[6];
         case "토마토 추가":
        	 return SHMenu2.addToppingPrice[0];
         case "치즈 추가":
        	 return SHMenu2.addToppingPrice[1];
         case "베이컨 추가":
        	 return SHMenu2.addToppingPrice[2];
         case "비프패티 추가":
        	 return SHMenu2.addToppingPrice[3];
         case "추가토핑 X":
        	 return SHMenu2.addToppingPrice[4];
         default:
             return 0;
        }
    }
}


   
   
class JHReceipt {
	   private static int OrderNumber = 1234;
	   private static final String name = "박건혁";
	    private static Map<String, Integer> products = new LinkedHashMap<>();
	    private int price = 0;
	    private String productName;
	    public int totalAmount;
	    public static int point;
	    
	   public int getTotalAmount() {
	      return totalAmount;
	   }


	   public void setTotalAmount(int totalAmount) {
	      this.totalAmount = totalAmount;
	   }


	   public int getPrice() {
	      return price;
	   }


	   public void setPrice(int price) {
	      this.price = price;
	   }


	   public String getProductName() {
	      return productName;
	   }


	   public void setProductName(String productName) {
	      this.productName = productName;
	   }   


	   public static String getName() {
	      return name;
	   }
	   
	   
	   public static int getOrderNumber() {
	      return OrderNumber;
	   }
	   
	   public static void setOrderNumber(int orderNumber) {
	      OrderNumber = orderNumber;
	   }
	   
	   public static void addProduct(String productName) {
	       products.put(productName, products.getOrDefault(productName, 0) + 1);
	   }
	   
	   public static void printReceipt() {
		      JHReceipt jh = new JHReceipt();
		      OrderNumber++;
		      LocalDateTime now = LocalDateTime.now();         
		      System.out.println("===============KOTTE RIA================== \n"
		            +"서울특별시 금천구 가산디지털2로 101, B동 308호    \n"
		            +"(가산동, 한라원앤원타워)                        \n"
		            +"☎ 031.3512.XXXX 대표 XXX\n"
		            +"                 [판매]\n"
		            +"거래일: "+now.getYear()+"/"+now.getMonthValue()+"/"+now.getDayOfMonth()
		            +"("+now.getDayOfWeek().toString()+")"+" "+now.getHour()+":"+now.getMinute()
		            +":"+now.getSecond()+"\n"
		            +"판매담당:0028/"+getName()+"\t\t     "+"주문번호: "+JHReceipt.getOrderNumber()+"\n"
		            +"==========================================\n"
		            +"제품명"+"\t\t단가\t수량"+"\t     금 액"+"\n"
		            +"==========================================");
		      for (String productName : products.keySet()) {
		            int quantity = products.get(productName);
		            double price = Product.getPrice(productName);
		            double total = quantity * price;
		            jh.totalAmount+=total;
		            if(productName.length() == 3) {
		               System.out.printf("#%-5s%12.0f\u20A9%7d%14.0f\u20A9\n", productName, price, quantity, total);
		            }else if(productName.length() == 4) {
		               System.out.printf("#%-5s%11.0f\u20A9%7d%14.0f\u20A9\n", productName, price, quantity, total);
		            }else if(productName.length() == 5) {
		               System.out.printf("#%-5s%11.0f\u20A9%7d%14.0f\u20A9\n", productName, price, quantity, total);
		            }else if(productName.length() == 6) {
		               System.out.printf("#%-5s%10.0f\u20A9%7d%14.0f\u20A9\n", productName, price, quantity, total);
		            }else if(productName.length() == 7) {
		               System.out.printf("#%-5s%8.0f\u20A9%7d%14.0f\u20A9\n", productName, price, quantity, total);
		            }else if(productName.length() == 8) {
		               System.out.printf("#%-5s%7.0f\u20A9%7d%14.0f\u20A9\n", productName, price, quantity, total);
		            }
		      }
		      
		        System.out.println("==========================================\n"
		                      +"현금\t\t\t\t    "+jh.totalAmount+"원\n"
		                      +"포인트사용\t\t\t\t        "+jh.point+"p\n"
		                      +"==========================================\n"
		                      +"총금액                                "+(jh.totalAmount-jh.point)+"원");
		                       
		      }
	   
	   
	   public static void notreceipt() {
	      JHReceipt jh = new JHReceipt();
	      OrderNumber++;
	      LocalDateTime now = LocalDateTime.now();
	      System.out.println("====================================================\n"
	                    +"\t        KOTTE RIA\n" 
	                    +"\t\t  주문번호\n"
	                    +"\t\t   "+JHReceipt.getOrderNumber()+"  \n"
	                    +"\t      주문시간:"+now.getHour()+":"+now.getMinute()+":"+now.getSecond()+"\n"
	                    +"====================================================\n"
	                    +"제품명\t\t수량\n"
	                    +"====================================================");
	                     
	      for (String productName : products.keySet()) {
	            int quantity = products.get(productName);
	            double price = Product.getPrice(productName);
	            double total = quantity * price;
	            jh.totalAmount+=total;
	            if(productName.length() == 3) {
	               System.out.printf("#%-5s%12d\n", productName,quantity);
	            }else if(productName.length() == 4) {
	               System.out.printf("#%-5s%11d\n", productName,quantity);
	            }else if(productName.length() == 5) {
	               System.out.printf("#%-5s%11d\n", productName,quantity);
	            }else if(productName.length() == 6) {
	               System.out.printf("#%-5s%10d\n", productName,quantity);
	            }else if(productName.length() == 7) {
	               System.out.printf("#%-5s%9d\n", productName,quantity);
	            }else if(productName.length() == 8) {
	               System.out.printf("#%-5s%7d\n", productName,quantity);
	            }
	      }
	      System.out.println("====================================================");
	      System.out.println("             주문서를 카운터 직원에게\n"
	                      +"                 전달해 주세요");
	      
	   }
	   
	}