package monday.subtitlefixer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Main {
	public static void main(String[] args) throws IOException {
		new SubtitleFixer(new File("lost.s04e11.hdtv.xvid-2hd.srt"));
	}
}
