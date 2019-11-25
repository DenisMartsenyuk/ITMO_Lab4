import exceptions.*;
import citizens.*;
import enums.*;
import items.*;

public class Main {
	public static void main(String[] args) {

		Scenario scenario = new Scenario();
		scenario.add("Все персонажи являются вымышленными!\n" + 
					 "Любое совпадения с реальными людьми случайны. Но это не точно.\n");
		scenario.add("Они подошли и сели рядом с ней.");
		scenario.add("Мысли автора: Эти двое никогда не блистали умственными способностями, \n" + 
					 "              Поэтому то, что они копали ножами было не удивительно.\n" + 
					 "Тем временем в Космическом городе была тишина.");
		scenario.add("Не спали лишь Знайка и Профессор Звездочкин.");
		scenario.add("Это они производят вычисления траектории полета космического корабля. " +
					 "Он должен попасть точно в отверстие, имевшееся в лунной сфере,\n" +
					 "сквозь которое можно было выбраться на поверхность Луны.\n" +
					 "Уже было далеко за полночь, когда Знайка и профессор Звездочкин " +  
					 "закончили все расчеты и стали ложиться спать. ");
		scenario.add("\nПродолжение следует...");

		Korotyshka sprutus = new Korotyshka("Спрутус", LifeStyle.EVIL);
		Korotyshka.Organ sprutusHands = sprutus.new Organ("Руки");
		Korotyshka julio = new Korotyshka("Жулио", LifeStyle.EVIL);
		Korotyshka ilya = new Korotyshka("Илья", LifeStyle.KIND);
		Korotyshka denis = new Korotyshka("Денис", LifeStyle.KIND);
		Korotyshka semen = new Korotyshka("Семён", LifeStyle.KIND);
		Korotyshka znajka = new Korotyshka("Знайка", LifeStyle.KIND);
		Korotyshka professor = new Korotyshka("Профессор Звездочкин", LifeStyle.KIND);
		ActItem fence = new ActItem("Забор");
		ActItem secretLight= new ActItem("Потайной фонарь");
		ActItem knife = new ActItem("Нож");
		ActItem notebook = new ActItem("Тетрадь");
		ActItem box = new ActItem("Ящик");
		ActItem door = new ActItem("Дверь ангара");
		ActItem electricity = new ActItem("Электричество");
		ActItem bed = new ActItem("Кровать");
		ActItem blanket = new ActItem("Одеяло");
		NonActItem wall = new NonActItem("Стена");
		NonActItem moon = new NonActItem("Луна");
		NonActItem explosion = new NonActItem("Взрыв");
		NonActItem plaster = new NonActItem("Штукатурка");
		NonActItem glasses = new NonActItem("Стекла");

		scenario.get(0);
		fence.use(TypeMsg.HUMAN_ITEM, "", " кряхтя, залез на ", " спрыгнул с другой стороны.", sprutus);
		box.use(TypeMsg.HUMAN_ITEM, "", " поднял с земли ", " и попытался передать его.", julio);
		sprutusHands.process("", " протянул кверху ", ".");
		box.use(TypeMsg.HUMAN_ITEM, "", " старался подхватить ", ".", sprutus);
		box.use(TypeMsg.ITEM_HUMAN, "Но ", " оказался очень тяжелым. ", " не удержал его и полетел вместе с ним на землю.", sprutus);
		fence.use(TypeMsg.HUMAN_ITEM, "", " вслед перелез через ", ".", julio);
		door.use(TypeMsg.ITEM_HUMAN, "Подергав ", ", ", " понял, что она закрыта. ", julio);
		secretLight.use(TypeMsg.HUMAN_ITEM, "Тогда, ", " включил ", ".", sprutus);
		julio.process("", " огляделся.");
		wall.use("Видят - ", ".");
		scenario.get(1);
		knife.use(TypeMsg.HUMAN_ITEM, "", " взял ", " и начал рыть им землю.", sprutus);
		knife.use(TypeMsg.HUMAN_ITEM, "", " взял ", " и тоже начал рыть им землю.", julio);
		scenario.get(2);
		ilya.process("Коротышка ", " сладко спит в кроватке. Видимо на пары он завтра не пойдет.");
		denis.process("", " дрыхнет без задних ног, ведь он опять знатно перебрал сегодняшним вечером.");
		semen.process("И ", " спит. Ночная мозговая активность у него сегодня слабая, поэтому он не лунатит.");

		class Promotion {
			public void advertise() {
				System.out.println("\nА спонсор сегодняшней лабораторной работы - Бессонная ночь.\n" +
								   "Бессонная ночь - нет сил, зато была куча времени!\n");
			}
		}
		Promotion kibitzer = new Promotion();
		kibitzer.advertise();

		scenario.get(3);
		notebook.use(TypeMsg.HUMAN_ITEM, "", " писал что-то в свою ", ".", znajka);
		professor.process("А ", " рассматривал небо. ");
		moon.use("На нем ярко была видна ", ".");
		scenario.get(4);
		electricity.use(TypeMsg.HUMAN_ITEM, "Раздевшись, ", " выключил ", ".", znajka);
		bed.use(TypeMsg.HUMAN_ITEM, "", " забрался в ", ".", znajka);
		blanket.use(TypeMsg.HUMAN_ITEM, "", " только хотел натянуть на себя ", ", но как раз в это время произошло неожиданное...", znajka);
		explosion.use("Прогремел ", "!");
		wall.use("", " затряслась.");
		plaster.use("С грохотом поспалась ", ".");
		glasses.use("Все ", " повылетали!");
		bed.use(TypeMsg.ITEM_HUMAN, "", ", на которой лежал ", " перевернулась, и он упал на пол. ", znajka);
		professor.process("", ", который в этой же комнате, тоже оказался на полу. ");
		blanket.use(TypeMsg.ITEM_HUMAN, "Закутавшись в ", ", ", " моментально выскочил во двор и увидел поднимающийся кверху столб пламени и дыма.", znajka);
		scenario.get(5);
	}
}