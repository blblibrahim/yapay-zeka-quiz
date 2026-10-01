import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "Eğitim verisinde başarılı, yeni verilerde başarısız olan model hangi durumu gösterir?",
            "PCA'nın temel amacı nedir?",
            "Tahmin sırasında kullanılamaması gereken bilginin modele verilmesine ne denir?",
            "Güncel web bilgilerini kaynaklarıyla araştırmak için hangi araç en uygundur?",
            "Bir sınıflandırma modelinde karar eşiği 0,5'ten 0,8'e yükseltilirse hangisi kesinlikle doğrudur?",
            "Bir yapay zekâ ajanı çok adımlı bir görevi genellikle nasıl yürütür?",
            "Modelin eğitimde görmediği örneklerde de başarılı olmasına ne denir?"
        };

        String[][] options = {
            {"A) Underfitting", "B) Overfitting", "C) Normalizasyon", "D) Kümeleme"},
            {"A) Modeli eğitmek", "B) Eksik etiketleri doldurmak", "C) Eski veriler ile eşleştirmek", "D) Boyut sayısını azaltmak"},
            {"A) Veri sızıntısı", "B) Ölçekleme", "C) Boyut indirgeme", "D) Veri artırma"},
            {"A) Claude", "B) Perplexity", "C) Manus", "D) Gemini Notebook"},
            {"A) Pozitif tahmin sayısı artar", "B) Modelin doğruluğu kesin artar", "C) Duyarlılık kesin artar", "D) Pozitif tahmin sayısı artamaz"},
            {"A) Tek yanıt üretip durur", "B) Plan yapar, araç kullanır ve sonuçlara göre ilerler", "C) Eğitim verisini değiştirir", "D) Sonuçlara göre adımlarını değiştiremez"},
            {"A) Ezberleme", "B) Genelleme", "C) Veri sızıntısı", "D) Etiketleme"}
        };

        char[] correctAnswers = {'B', 'D', 'A', 'B', 'D', 'B', 'B'};
        int score = 0;

        System.out.println("Yapay Zekâ Quizine Hoş Geldin!");
        System.out.println("Cevap vermek için A, B, C veya D yazmalısın dostum.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            String answer;
            while (true) {
                System.out.print("Cevabın: ");
                answer = scanner.nextLine().trim().toUpperCase();

                if (answer.length() == 1 && "ABCD".contains(answer)) {
                    break;
                }

                System.out.println("Lütfen A, B, C veya D seçeneklerinden birini gir.");
            }

            if (answer.charAt(0) == correctAnswers[i]) {
                System.out.println("Doğru!\n");
                score++;
            } else {
                System.out.println("Yanlış. Doğru cevap: " + correctAnswers[i] + "\n");
            }
        }

        System.out.println("Quiz tamamlandı!");
        System.out.println("Puanın: " + score + " / " + questions.length);

        if (score >= 6)	{
        	System.out.println("Manyaksın başa belasın be!!!");
        }else if (score >= 4) {
        	System.out.println("Fena değilsin cano");
        }else {
        	System.out.println("Daha yolun var canım");
        }
        scanner.close();
        	
        	
        	
        	
        	
        	
        	
        }
    }


