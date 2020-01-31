package com.java.myunjub.serialize;

import static org.junit.Assert.assertEquals;

import com.java.myunjub.serialize.Team.Players;
import com.java.myunjub.serialize.Team.Players.Player;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.junit.Test;

public class JaxbTest {

  @Test
  public void useJaxbObject() {
    final Team team = new Team();
    team.setName("Study");

    final Team.Players players = new Team.Players();

    final Team.Players.Player sunny = new Team.Players.Player();
    sunny.setName("sunny.sunny");
    sunny.setPosition("Developer");

    final Team.Players.Player chloe = new Team.Players.Player();
    chloe.setName("chloe.oh");
    chloe.setPosition("Ticket");

    players.getPlayer().add(sunny);
    players.getPlayer().add(chloe);

    team.setPlayers(players);

    final String position = team.getPlayers().getPlayer().get(0).getPosition();

    assertEquals("Developer", position);
  }

  @Test
  public void readXml() throws JAXBException {
    final JAXBContext context = JAXBContext.newInstance("com.java.myunjub.serialize");

    final Unmarshaller unmarshaller = context.createUnmarshaller();
    final Team team = (Team) unmarshaller.unmarshal(
        getClass().getResourceAsStream("/src/main/java/com/java/myunjub/serialize/teamSample.xml"));

    assertEquals(2, team.getPlayers().getPlayer().size());
  }

  @Test
  public void writeXml() throws JAXBException, FileNotFoundException {
    final ObjectFactory factory = new ObjectFactory();
    final Team team = factory.createTeam();
    final Players players = factory.createPlayers();
    final Player player = factory.createPlayer();
    player.setName("Simon Smith");
    player.setPosition("Substitute");
    players.getPlayer().add(player);
    team.setName("Megastars");
    team.setPlayers(players);
    final JAXBContext context =
        JAXBContext.newInstance(
            "com.wiley.javainterviewsexposed.chapter15.generated2");
    final Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    marshaller.marshal(team, new FileOutputStream("/tmp/team.xml"));
  }
}
