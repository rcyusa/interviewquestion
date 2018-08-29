import { TestBed, inject } from '@angular/core/testing';

import { MatchesTeamService } from './matches-team.service';

describe('MatchesTeamService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [MatchesTeamService]
    });
  });

  it('should be created', inject([MatchesTeamService], (service: MatchesTeamService) => {
    expect(service).toBeTruthy();
  }));
});
