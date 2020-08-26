# Loglama -> Asenkron olmalidir. 
    Bunu yapmazsak uygulama performansi biraz kaybedilmis olur.       
    Request boylece gecikmemis olacaktir.
    Arkaplanda calismasi icin ve boylece performans kaybi yasayamayacagiz.

#   printStackTrace ve sout(println) -> Kullanilmamalidir.Formatlarimiza aykiridir
    Configiration dosyalari ekledigimiz zaman farkli formatlar kullanacagiz.
    Bazen json veya txt dosyalarina loglama isi yapacagiz.
    Bu 2 kullanim bu yapiya aykiridir.

#   Sensitive data -> Password, kullanici id vb loglama islemlerinde kullanilmamalidir.
    Veri guvenliginin onemli oldugu kisimlarda kullanilmamalidir.
    Veriye bagli hata veya durum uretmemeliyiz.

#   Tum loglar merkezi bir yerde toplanmalidir ve belirli bir formatta olmalidir.
    Mesela login isleminde sorun yasiyorsam, ona request id olusturabilir ve merkezi bir yerde bu hatayi toplayarak zamandan kazanmis olurum.

#   Levellar dikkatli kullanilmalidir.

#   Handler -> Farkli leveller icin farkli appedarlar kullanilabilir.
    Bu sayede tum loglar merkezi yere toplandiktan sonra error veya debug loglari ayni stackte duruyorsa ben mesela
    sadece debug olan loglari silmek istersem bunlari handlerlar sayesinde yapabilirim.
                 
#   Lombok icerisinde bize bir ozellik verilmistir.
    loglari devredecegimiz instance (Her classa ozel olacaktir.)
    Logger logger = LoggerFactory.getLogger(LogEndPoint.class);
    her sinif icin belirtmek yerine ; @Slf4j diyebiliriz.
