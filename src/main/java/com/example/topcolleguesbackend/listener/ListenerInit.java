package com.example.topcolleguesbackend.listener;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.topcolleguesbackend.entity.Collegue;
import com.example.topcolleguesbackend.repository.CollegueRepository;

@Component
public class ListenerInit {

	@Autowired	private CollegueRepository repoCol;
	
	@EventListener({ ContextRefreshedEvent.class })
	void contextRefreshedEvent() {
		Stream.of(new Collegue("Pauline", "https://www.wikichat.fr/wp-content/uploads/sites/2/MAINE-COON.png",100),
				new Collegue("Clément", "https://www.robot-advance.com/ori-robot-maze-breaker-noir-silverlit-1885.jpg", 100),
				new Collegue("Nico", "https://pre00.deviantart.net/4916/th/pre/f/2017/053/c/5/vector__662___llama_kuzco_by_dashiesparkle-db00jr4.png", 0),
				new Collegue("Flo", "http://resize1-doctissimo.ladmedia.fr/r/1010,,forcex/img/var/doctissimo/storage/images/fr/www/animaux/diaporamas/chat-moche/chat-moche-a-poils-longs/2266601-1-fre-FR/Chat-moche-a-poils-longs.jpg", 0),
				new Collegue("Benjamin", "https://www.franceinter.fr/s3/cruiser-production/2017/02/37a25524-e34f-494c-ad21-f836b012b9e7/640_taxte_robots_gettyimages-634461687.jpg", 100),
				new Collegue("Ariel","http://alerterousse.com/wp-content/uploads/2014/09/89396183_p.png",0),
				new Collegue("Belle", "https://thoughtsopinionsandeverything.files.wordpress.com/2015/10/ht_belle_beauty_beast_kb_150126_4x3_992.jpg" ,0)
				).forEach(repoCol::save);
	}
}

