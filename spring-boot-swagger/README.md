# Spring Boot Swagger Documentation

Web API geliştirmede en önemli ihtiyaçlardan biri dökümantasyon ihtiyacıdır.
Çünkü API metodlarının ne işe yaradığı ve nasıl kullanıldığı dökümantasyon içerisinde olması gerekir. Bu dökümantasyon her zaman güncel tutulmalıdır. 
Bununla birlikte bu ihtiyacımızı giderecek swagger ortaya çıkmıştır.

* Swagger'ın önemli bir amacı RestAPI'ler için bir arayüz sağlamaktır.
* Swagger sitesinde bir çok programlama dili ve framework için kullanılması gereken yapı hakkında bilgi yer almaktadır.
* Spring içinse SpringFox çıkarılmıştır.
* Swagger ile gelen bir başka kullanım kolaylığı ise artık biz projelerimiz de Apı bilgilerimize Postman veya SoapUI üzerinden bakma mecburiyetimiz ortadan kalkmıştır. Bu işlemleri swagger üzerinden de gerçekleştirebilmekteyiz.

* Dependency olarak projemize ekleyebiliriz. 
*     <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>2.9.2</version>
        </dependency>
        
        
Projemizde gerekli ayarlamaları yaptıktan sonra projeyi ayağa kaldırdığımızda her zaman görmüş olduğumuz JSON formatında API değerlerimizi görürüz.
<img width="696" alt="Screenshot 2020-09-05 16 04 46" src="https://user-images.githubusercontent.com/34593997/92305625-a96cd600-ef91-11ea-93ef-6e9deeaeae93.png">

* Swagger ile;
* Projemizde konsolda log kısmına baktığımızda 
Mapped URL path [/v2/api-docs] onto method [springfox.documentation.swagger2.web.Swagger2Controller#getDocumentation(String, HttpServletRequest)]
bize böyle bir değer vermektedir. verdiği bu path bizim Swagger dokümantasyonumuzdur.
* Bu URL'e gitmek için; http://localhost:8080/v2/api-docs gideriz. 

<img width="697" alt="Screenshot 2020-09-05 15 46 36" src="https://user-images.githubusercontent.com/34593997/92305580-42e7b800-ef91-11ea-8924-5343a70989f0.png">


* Swagger'ın bize sunmuş olduğu bir başka güzellik ise direk projemizi swagger-ui arayüzü ile kullanmamızı da sağlayabiliyor.
*      <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>2.9.2</version>
        </dependency>
        
