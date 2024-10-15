
public class Biography extends TextBook {
    private String about;

        public Biography() {
        super();
        about = "";
        }

        public Biography (String title, int year, double price, String subject, String genre, String about) {
            super(title, year, price, genre);
            this.about = about;
        }

        public String getAbout() {
            return this.about;
        }

        public void setAbout(String about) {
            this.about = about;
        }

        public void print() {
            super.print();
            System.out.println(" About: " + about);
        }
    }
    
    

