import { TestBed, inject } from '@angular/core/testing';

import { GetSortedTeamService } from './get-sorted-team.service';

describe('GetSortedTeamService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [GetSortedTeamService]
    });
  });

  it('should be created', inject([GetSortedTeamService], (service: GetSortedTeamService) => {
    expect(service).toBeTruthy();
  }));
});
