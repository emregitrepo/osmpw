# Osmanli Yatirim Playwright Test Projesi

Bu proje, Osmanli Yatirim web uygulaması için Playwright ve Cucumber BDD kullanarak otomatik test senaryoları geliştirmek amacıyla oluşturulmuştur.

## 🚀 Proje Özellikleri

- **Playwright**: Modern web otomasyon framework'ü
- **Cucumber BDD**: Behavior Driven Development yaklaşımı
- **JUnit 5**: Test framework'ü
- **Maven**: Proje yönetimi ve bağımlılık yönetimi
- **Page Object Model**: Sürdürülebilir test yapısı

## 📁 Proje Yapısı

```
OsmanliYatirimPW/
├── pom.xml                          # Maven konfigürasyonu
├── README.md                        # Proje dokümantasyonu
└── src/
    ├── main/java/utilities/
    │   └── Driver.java              # Browser yönetimi utility sınıfı
    └── test/
        ├── java/
        │   ├── pages/
        │   │   ├── CommonPage.java          # Ortak kullanılan metodlar
        │   │   └── LoginPage.java           # Login sayfası işlemleri
        │   ├── runners/
        │   │   └── CukesRunner.java         # Cucumber test runner
        │   └── stepDefinitions/
        │       └── LoginStepDef.java        # Step definitions
        └── resources/features/
            └── login-page.feature           # BDD feature dosyası
```

## 🛠️ Kurulum

### Gereksinimler
- Java 21
- Maven 3.6+
- Git

### Kurulum Adımları

1. Projeyi klonlayın:
```bash
git clone <repository-url>
cd OsmanliYatirimPW
```

2. Bağımlılıkları yükleyin:
```bash
mvn clean install
```

3. Playwright browser'larını yükleyin:
```bash
mvn exec:java -e -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"
```

## 🧪 Test Çalıştırma

### Tüm Testleri Çalıştırma
```bash
mvn clean test
```

### Sadece Cucumber Testlerini Çalıştırma
```bash
mvn test -Dtest=CukesRunner
```

### Belirli Feature Dosyasını Çalıştırma
```bash
mvn test -Dcucumber.features="src/test/resources/features/login-page.feature"
```

### Tag ile Test Çalıştırma
```bash
# Sadece smoke testleri
mvn test -Dcucumber.filter.tags="@smoke"

# Login testleri
mvn test -Dcucumber.filter.tags="@login"

# Browser tag'i olan testler (tam browser temizliği)
mvn test -Dcucumber.filter.tags="@browser"
```

## 📋 Mevcut Test Senaryoları

### Login Sayfası Testleri
- **Feature**: `login-page.feature`
- **Senaryo**: Login sayfasını açma
- **URL**: https://esubedev.osmanlimenkul.com.tr/login

## 🔧 Geliştirme

### Yeni Page Object Ekleme
1. `src/test/java/pages/` klasörüne yeni page sınıfı ekleyin
2. `CommonPage` sınıfından extend edin
3. Locator'ları ve metodları tanımlayın

### Yeni Feature Ekleme
1. `src/test/resources/features/` klasörüne `.feature` dosyası ekleyin
2. Gherkin syntax kullanarak senaryoları yazın
3. `src/test/java/stepdefs/` klasörüne step definitions ekleyin

### Yeni Step Definition Ekleme
1. Mevcut `LoginStepDef.java` dosyasına yeni metodlar ekleyin
2. Veya yeni bir StepDefs sınıfı oluşturun
3. `@Given`, `@When`, `@Then` annotation'larını kullanın
4. Before/After metodları için `Hooks.java` sınıfını kullanın

## 📊 Test Raporları

Test çalıştırıldıktan sonra raporlar şu konumlarda oluşturulur:
- **HTML Rapor**: `target/cucumber-reports/cucumber-pretty.html`
- **JSON Rapor**: `target/cucumber-reports/CucumberTestReport.json`

## 🔍 Ortak Kullanılan Metodlar

### CommonPage Sınıfı
- `waitFor(Locator)`: Element görünür olana kadar bekler
- `click(Locator)`: Elemente tıklar
- `fill(Locator, String)`: Elemente metin yazar
- `type(Locator, String)`: Karakter karakter yazar
- `assertElementText(Locator, String)`: Metin kontrolü yapar
- `loggerInfo(String)`: Log mesajı yazdırır

### Driver Utility Sınıfı
- `getPage()`: Mevcut page instance'ını döndürür
- `newPage()`: Yeni page oluşturur
- `closePage()`: Sadece page'i kapatır
- `closeDriver()`: Tüm kaynakları temizler
- `restartBrowser()`: Browser'ı yeniden başlatır

### Hooks Sınıfı
- `@Before`: Her test senaryosu öncesi çalışır
- `@After`: Her test senaryosu sonrası çalışır
- `@After("@browser")`: Browser tag'i olan senaryolar sonrası tüm kaynakları temizler

## 🚀 Geliştirme Planı

### Tamamlanan Özellikler ✅
- [x] Proje yapısı oluşturuldu
- [x] POM dosyası konfigürasyonu
- [x] CommonPage sınıfı
- [x] LoginPage sınıfı
- [x] Login sayfası feature dosyası
- [x] Step definitions
- [x] Cucumber test runner (CukesRunner)
- [x] Driver utility sınıfı
- [x] Hooks sınıfı (Before/After metodları)
- [x] Tag yönetimi (@smoke, @login, @browser)
- [x] MacFit proje yapısına uygun düzenleme
- [x] README dokümantasyonu

### Gelecek Geliştirmeler 📋
- [ ] Login işlevselliği testleri
- [ ] Dashboard sayfası testleri
- [ ] Kullanıcı yönetimi testleri
- [ ] Raporlama testleri
- [ ] API test entegrasyonu
- [ ] Paralel test çalıştırma
- [ ] CI/CD pipeline entegrasyonu
- [ ] Test verisi yönetimi
- [ ] Screenshot ve video kayıt özellikleri

## 🐛 Sorun Giderme

### Yaygın Sorunlar

1. **Browser yüklenmedi hatası**:
   ```bash
   mvn exec:java -e -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"
   ```

2. **Cucumber step bulunamadı hatası**:
   - Step definition'ların doğru package'ta olduğunu kontrol edin
   - CucumberTestRunner'da glue path'in doğru olduğunu kontrol edin

3. **Element bulunamadı hatası**:
   - Locator'ların güncel olduğunu kontrol edin
   - Sayfanın tamamen yüklendiğinden emin olun

## 📞 İletişim

Proje ile ilgili sorularınız için:
- **Geliştirici**: [Geliştirici Adı]
- **Email**: [Email Adresi]
- **Proje**: Osmanli Yatirim Test Otomasyonu

## 📄 Lisans

Bu proje [Lisans Adı] altında lisanslanmıştır.

---

**Son Güncelleme**: $(date)
**Versiyon**: 1.0.0
