import java.util.ArrayDeque;

import exceptions.*;
import citizens.*;
import enums.*;
import items.*;

public class History {

	private Scenario scenario = new Scenario();

	private Korotyshka sprutus = new Korotyshka("Спрутус", LifeStyle.EVIL);
	private Korotyshka.Organ sprutusHands = sprutus.new Organ("Руки");
	private Korotyshka julio = new Korotyshka("Жулио", LifeStyle.EVIL);
	private Korotyshka ilya = new Korotyshka("Илья", LifeStyle.KIND);
	private Korotyshka denis = new Korotyshka("Денис", LifeStyle.KIND);
	private Korotyshka semen = new Korotyshka("Семён", LifeStyle.KIND);
	private Korotyshka znajka = new Korotyshka("Знайка", LifeStyle.KIND);
	private Korotyshka professor = new Korotyshka("Профессор Звездочкин", LifeStyle.KIND);
	private ActItem fence = new ActItem("Забор");
	private ActItem secretLight= new ActItem("Потайной фонарь");
	private ActItem knife = new ActItem("Нож");
	private ActItem notebook = new ActItem("Тетрадь");
	private ActItem box = new ActItem("Ящик");
	private ActItem door = new ActItem("Дверь ангара");
	private ActItem electricity = new ActItem("Электричество");
	private ActItem bed = new ActItem("Кровать");
	private ActItem blanket = new ActItem("Одеяло");
	private NonActItem wall = new NonActItem("Стена");
	private NonActItem moon = new NonActItem("Луна");
	private NonActItem explosion = new NonActItem("Взрыв");
	private NonActItem plaster = new NonActItem("Штукатурка");
	private NonActItem glasses = new NonActItem("Стекла");

	public void buildHistory() {
		scenario.add("Все персонажи являются вымышленными!\n" + 
					 "Любое совпадения с реальными людьми случайны. Но это не точно.\n");
		scenario.add(fence.use(TypeMsg.HUMAN_ITEM, "", " кряхтя, залез на ", " спрыгнул с другой стороны.\n", sprutus));
		scenario.add(box.use(TypeMsg.HUMAN_ITEM, "", " поднял с земли ", " и попытался передать его.\n", julio));
		scenario.add(sprutusHands.process("", " протянул кверху ", ".\n"));
		scenario.add(box.use(TypeMsg.HUMAN_ITEM, "", " старался подхватить ", ".\n", sprutus));
		scenario.add(box.use(TypeMsg.ITEM_HUMAN, "Но ", " оказался очень тяжелым. ", " не удержал его и полетел вместе с ним на землю.\n", sprutus));
		scenario.add(fence.use(TypeMsg.HUMAN_ITEM, "", " вслед перелез через ", ".\n", julio));
		scenario.add(door.use(TypeMsg.ITEM_HUMAN, "Подергав ", ", ", " понял, что она закрыта. \n", julio));
		scenario.add(secretLight.use(TypeMsg.HUMAN_ITEM, "Тогда, ", " включил ", ".\n", sprutus));
		scenario.add(julio.process("", " огляделся.\n"));
		scenario.add(wall.use("Видят - ", ".\n"));
		scenario.add("Они подошли и сели рядом с ней.\n");
		scenario.add(knife.use(TypeMsg.HUMAN_ITEM, "", " взял ", " и начал рыть им землю.\n", sprutus));
		scenario.add(knife.use(TypeMsg.HUMAN_ITEM, "", " взял ", " и тоже начал рыть им землю.\n", julio));
		scenario.add("Мысли автора: Эти двое никогда не блистали умственными способностями, \n" + 
					 "              Поэтому то, что они копали ножами было не удивительно.\n" + 
					 "Тем временем в Космическом городе была тишина.\n");
		scenario.add(ilya.process("Коротышка ", " сладко спит в кроватке. Видимо на пары он завтра не пойдет.\n"));
		scenario.add(denis.process("", " дрыхнет без задних ног, ведь он опять знатно перебрал сегодняшним вечером.\n"));
		scenario.add(semen.process("И ", " спит. Ночная мозговая активность у него сегодня слабая, поэтому он не лунатит.\n"));

		class Promotion {
			public String advertise() {
				return "\nА спонсор сегодняшней лабораторной работы - Бессонная ночь.\n" +
								   "Бессонная ночь - нет сил, зато была куча времени!\n\n";
			}
		}
		Promotion kibitzer = new Promotion();

		scenario.add(kibitzer.advertise());
		scenario.add("Не спали лишь Знайка и Профессор Звездочкин.\n");
		scenario.add(notebook.use(TypeMsg.HUMAN_ITEM, "", " писал что-то в свою ", ".\n", znajka));
		scenario.add(professor.process("А ", " рассматривал небо. \n"));
		scenario.add(moon.use("На нем ярко была видна ", ".\n"));
		scenario.add("Это они производят вычисления траектории полета космического корабля. " +
					 "Он должен попасть точно в отверстие, имевшееся в лунной сфере,\n" +
					 "сквозь которое можно было выбраться на поверхность Луны.\n" +
					 "Уже было далеко за полночь, когда Знайка и профессор Звездочкин " +  
					 "закончили все расчеты и стали ложиться спать. \n");
		scenario.add(electricity.use(TypeMsg.HUMAN_ITEM, "Раздевшись, ", " выключил ", ".\n", znajka));
		scenario.add(bed.use(TypeMsg.HUMAN_ITEM, "", " забрался в ", ".\n", znajka));
		scenario.add(blanket.use(TypeMsg.HUMAN_ITEM, "", " только хотел натянуть на себя ", ", но как раз в это время произошло неожиданное...\n", znajka));
		scenario.add(explosion.use("Прогремел ", "!\n"));
		scenario.add(wall.use("", " затряслась.\n"));
		scenario.add(plaster.use("С грохотом поспалась ", ".\n"));
		scenario.add(glasses.use("Все ", " повылетали!\n"));
		scenario.add(bed.use(TypeMsg.ITEM_HUMAN, "", ", на которой лежал ", " перевернулась, и он упал на пол. \n", znajka));
		scenario.add(professor.process("", ", который в этой же комнате, тоже оказался на полу. \n"));
		scenario.add(blanket.use(TypeMsg.ITEM_HUMAN, "Закутавшись в ", ", ", " моментально выскочил во двор и увидел поднимающийся кверху столб пламени и дыма.\n", znajka));
		scenario.add("\nПродолжение следует...\n");
	}

	public void printHistory() throws UncheckedHistoryException {
		String history = scenario.getString();
		if (history.length() == 0) {
			throw new UncheckedHistoryException("\nВы не задали хронологию событий!\n");
		}
		System.out.println(scenario.getString());
	}
}