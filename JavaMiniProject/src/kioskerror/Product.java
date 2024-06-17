package kioskerror;
class Product {
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        switch (productName) {
            case "불고기버거":
                return 4600;
            case "불고기버거세트":
            	return 8100;
            case "치즈버거":
                return 5200;
            case "새우버거":
                return 5200;
            case "치킨버거":
                return 5500;
            case "베이컨치즈버거":
                return 6500;
            case "더블비프치즈버거":
                return 7900;
            case "사이다":
                return 2700;
            case "콜라":
                return 2000;
            case "아이스티":
                return 2300;
            case "아메리카노":
                return 2500;
            case "레몬에이드":
                return 2700;
            case "우유":
                return 1500;
            case "핫초코":
                return 2500;
            case "생수":
                return 1000;
            case "토마토":
                return 600;
            case "치즈":
                return 800;
            case "베이컨":
                return 1600;
            case "비프패티":
                return 2500;
            case "프렌치프라이":
                return 2100;
            case "양념감자":
                return 2600;
            case "치즈스틱":
                return 2600;
            case "치킨너겟":
                return 2900;
            case "오징어링":
                return 2800;
            case "콘샐러드":
                return 1900;
            default:
                return 0;
        }
    }
}