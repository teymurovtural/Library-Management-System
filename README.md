## 📚 Kitabxana İdarəetmə Sistemi (Library Management System)

### Giriş

Bu, kitabxana resurslarının effektiv idarə olunması üçün nəzərdə tutulmuş sadə, lakin güclü bir **RESTful API** proqramıdır. Layihə kitabların qeydiyyatını aparmağa, borc vermə proseslərini idarə etməyə və istifadəçi məlumatlarını izləməyə imkan verir.

### 🎯 Əsas Xüsusiyyətlər (Features)

* **Kitabların İdarə Edilməsi:** Yeni kitab əlavə etmək, mövcud kitabları yeniləmək, silmək və axtarmaq.
* **Borc Vermə / Geri Alma:** İstifadəçilərə kitabları borc vermək və geri alma proseslərini qeydə almaq.
* **İstifadəçi Qeydiyyatı:** Kitabxanadan istifadə edən oxucuların qeydiyyatı və idarə edilməsi.
* **Axtarış və Filtrasiya:** Kitabları müxtəlif parametrlərə (məsələn: ada, müəllifə) görə axtarmaq imkanı.

### 🛠️ İstifadə Olunan Texnologiyalar

Layihənin Backend hissəsi aşağıdakı əsas texnologiyalar üzərində qurulmuşdur:

| Kateqoriya | Texnologiya | Qeyd |
| :--- | :--- | :--- |
| **Dil** | Java 17+ | Əsas proqramlaşdırma dili |
| **Framework** | Spring Boot 3 | Tətbiqin sürətli inkişafı üçün |
| **Verilənlər Bazas** | PostgreSQL/MySQL/H2 | Verilənlər bazası seçiminə görə dəyişə bilər |
| **İdarəetmə Aləti** | Gradle | Layihə asılılıqlarının idarə edilməsi |
| **Mimarilik** | RESTful API | Müştəri tətbiqləri ilə əlaqə qurmaq üçün |

### ⚙️ Layihəni Yerli Qurmaq (Setup Guide)

Layihəni yerli kompüterinizdə işə salmaq üçün aşağıdakı addımları izləyin:

1.  **Layihəni Klonlayın (İlkin olaraq etmisiniz, bu sadəcə qeyddir):**
    ```bash
    git clone [https://github.com/teymurovtural/Library-Management-System.git](https://github.com/teymurovtural/Library-Management-System.git)
    cd Library-Management-System
    ```
2.  **Verilənlər Bazasını Tənzimləyin:** `src/main/resources/application.properties` faylını açaraq verilənlər bazası (Database) bağlantı məlumatlarını (URL, username, password) öz lokal parametrlərinizə uyğun olaraq dəyişin.
3.  **Layihəni Qurun və İşə Salın:**
    IDE-dən (məsələn, IntelliJ IDEA) istifadə edərək layihəni açın və `LibraryApplication.java` faylını çalışdırın.
