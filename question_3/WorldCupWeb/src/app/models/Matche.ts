import {HomeTeamStatistic} from './HomeTeamStatistic';
import {AwayTeamStatistic} from './AwayTeamStatistic';
import {HomeTeam} from './HomeTeam';
import {AwayTeam} from './AwayTeam';
import {HomeTeamEvent} from './HomeTeamEvent';
import {AwayTeamEvent} from './AwayTeamEvent';
/**
 * Created by cyusarodrigue on 8/29/18.
 */
export class Matche {

  public  venue: String;
  public  location: String;
  public  status: String;
  public  time: String;
  public  fifa_id: String;
  public  home_team_statistics: HomeTeamStatistic;
  public  away_team_statistics: AwayTeamStatistic;
  public  datetime: Date;
  public  last_event_update_at: Date;
  public  last_score_update_at: Date;
  public  home_team: HomeTeam;
  public  away_team: AwayTeam;
  public   winner: String;
  public  winner_code: String;
  public  home_team_events: HomeTeamEvent[];
  public  away_team_events: AwayTeamEvent[];
}
