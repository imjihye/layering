# layering

## 용어 정리

@ComponentScan : Bean을 자동으로 정의한것을 찾아줌. 따라서 AppConig 클래스가 필요 없음.
@Autowired : Bean을 자동으로 찾아내어 주입함.

## 애플리케이션 구성

엔트리 포인트 / 컨트롤러 -> 서비스 -> 리포지토리

각 레이어 클레서가 있고 DI컨테이너가 이 클레스들을 주입하도록 구성되어 있다.
DI컨테이너는 서비스에 리파지토리를 주입된한다.
DI컨테이너는 엔트리 포인트 / 컨트롤러에 서비스를 주입한다.