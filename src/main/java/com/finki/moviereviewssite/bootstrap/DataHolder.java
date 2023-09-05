package com.finki.moviereviewssite.bootstrap;

import com.finki.moviereviewssite.model.Movie;
import com.finki.moviereviewssite.model.Review;
import com.finki.moviereviewssite.model.User;
import com.finki.moviereviewssite.model.WatchList;
import com.finki.moviereviewssite.model.enumerations.Role;
import lombok.Getter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DataHolder {
    public static List<Movie> movies = new ArrayList<>();
    public static List<Review> reviews = new ArrayList<>();
    public static List<User> users = new ArrayList<>();
    public static List<WatchList> watchlists = new ArrayList<>();

    @PostConstruct
    public void init(){
        movies.add(new Movie("Inside Out (2015)",  "Growing up can be a bumpy road, and it's no exception for Riley, who is uprooted from her Midwest life when her father starts a new job in San Francisco. Like all of us, Riley is guided by her emotions - Joy, Fear, Anger, Disgust and Sadness. The emotions live in Headquarters, the control center inside Riley's mind, where they help advise her through everyday life. As Riley and her emotions struggle to adjust to a new life in San Francisco, turmoil ensues in Headquarters. Although Joy, Riley's main and most important emotion, tries to keep things positive, the emotions conflict on how best to navigate a new city, house and school.\n"));
        movies.add(new Movie("Toy Story (1995)", "Woody the cowboy is young Andy's favorite toy. Yet this changes when Andy get the new super toy Buzz Lightyear for his birthday. Now that Woody is no longer number one he plans his revenge on Buzz. Toy Story is a milestone in film history for being the first feature film to use entirely computer animation.\n"));
        movies.add(new Movie("Annie Hall (1977)", "The neurotic New Yorker Woody Allen tells one of the greatest romantic comedies to be set in the city of New York."));
        movies.add(new Movie("Monty Python and the Holy Grail (1975)", "Monty Python and the Holy Grail loosely follows the legend of King Arthur. Arthur along with his squire, Patsy, recruits his Knights of the Round Table, including Sir Bedevere the Wise, Sir Lancelot the Brave, Sir Robin the Not-Quite-So-Brave-As-Sir-Lancelot and Sir Galahad the Pure. On the way Arthur battles the Black Knight who, despite having had all his limbs chopped off, insists he can still fight. They reach Camelot, but Arthur decides not to enter, as it is a silly place.\n"));
        movies.add(new Movie("Back to the Future (1985)", "Eighties teenager Marty McFly is accidentally sent back in time to 1955, inadvertently disrupting his parents' first meeting and attracting his mother's romantic interest. Marty must repair the damage to history by rekindling his parents' romance and - with the help of his eccentric inventor friend Doc Brown - return to 1985.\n"));
        movies.add(new Movie("Up (2009)", "After a lifetime of dreaming of traveling the world, 78-year-old homebody Carl flies away on an unbelievable adventure with Russell, an 8-year-old Wilderness Explorer, unexpectedly in tow. Together, the unlikely pair embarks on a thrilling odyssey full of jungle beasts and rough terrain."));
        movies.add(new Movie("The Truman Show (1998)", "Truman Burbank is the star of \"The Truman Show\", a 24-hour-a-day \"reality\" TV show that broadcasts every aspect of his life -- live and in color -- without his knowledge. His entire life has been an unending soap opera for consumption by the rest of the world. And everyone he knows -- including his wife and his best friend -- is really an actor, paid to be part of his life.\n"));
        movies.add(new Movie("The Grand Budapest Hotel (2014)", "The Grand Budapest Hotel tells of a legendary concierge at a famous European hotel between the wars and his friendship with a young employee who becomes his trusted protÃ©gÃ©. The story involves the theft and recovery of a priceless Renaissance painting, the battle for an enormous family fortune and the slow and then sudden upheavals that transformed Europe during the first half of the 20th century.\n"));
        movies.add(new Movie("Birdman (2014)", "A fading actor best known for his portrayal of a popular superhero attempts to mount a comeback by appearing in a Broadway play. As opening night approaches, his attempts to become more altruistic, rebuild his career, and reconnect with friends and family prove more difficult than expected."));
        movies.add(new Movie("The Godfather (1972)", "The story spans the years from 1945 to 1955 and chronicles the fictional Italian-American Corleone crime family. When organized crime family patriarch Vito Corleone barely survives an attempt on his life, his youngest son, Michael, steps in to take care of the would-be killers, launching a campaign of bloody revenge."));

        users.add(new User("admin1", "admin1", "Admin", "Admin", Role.ROLE_ADMIN));
        users.add(new User("miabosheva", "mia1234", "Mia", "Bosheva", Role.ROLE_USER));
    }
}
