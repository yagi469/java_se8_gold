package q14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Musician> musicList = Arrays.asList(
			new Musician("Jimi Hendrix", Musician.Category.ROCK),
			new Musician("Eric Dolphy", Musician.Category.JAZZ),
			new Musician("J.S.Bach", Musician.Category.CLASSICAL),
			new Musician("Charles Mingus", Musician.Category.JAZZ)
		);

		Map<Musician.Category, List<String>> map = musicList.stream()
			.collect(Collectors.groupingBy(
					Musician::getCategory, 
					Collectors.mapping(Musician::getName, Collectors.toList())));

		System.out.println(map);
	}
}
