/*[문제]
 * 영단어로 매칭
 * 각 날씨에 할일을 메소드로 만들기 todo()
 * 각 날씨에 놀일을 메소드로 만들기 play()
 */
package myenum;

public enum Weather {
    맑음("Sunny") {
        public String todo() {
            return " 프롬가기";
        }

        public String play() {
            return "댄스신고식";
        }
    },
    안개("Foggy") {
        public String todo() {
            return "이불 안개 기";
        }

        public String play() {
            return "개구리잡기";
        }
    },
    흐림("Cloudy") {
        public String todo() {
            return "꿀꿀한마음 쇼핑으로 달래기";
        }

        public String play() {
            return "기치료 테라피";
        }
    },
    비("Rain") {
        public String todo() {
            return "마라탕먹고 살사추기";
        }

        public String play() {
            return "야호";
        }
    },
    눈("Snow") {
        public String todo() {
            return "BITCH 들과 눈싸움하기";
        }

        public String play() {
            return "빙수만들기";
        }
    };

    public String title;

    Weather(String title) {
        this.title = title;
    }

    public String todo() {
        return "마라탕먹고 살사추기";
    }

    public String play() {
        return "야호";
    }
}