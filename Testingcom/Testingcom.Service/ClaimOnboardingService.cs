using System.Threading.Tasks;
using Testingcom.DTO;
using Testingcom.DataAccess;

namespace Testingcom.Service
{
    public class ClaimOnboardingService : IClaimOnboardingService
    {
        private readonly IClaimOnboardingRepository _claimOnboardingRepository;

        public ClaimOnboardingService(IClaimOnboardingRepository claimOnboardingRepository)
        {
            _claimOnboardingRepository = claimOnboardingRepository;
        }

        public async Task<ClaimOnboardingModel> CreateAsync(ClaimOnboardingModel claimOnboardingModel)
        {
            var result = await _claimOnboardingRepository.CreateAsync(claimOnboardingModel);
            return result;
        }

        public async Task<ClaimOnboardingModel> ReadAsync(int id)
        {
            var result = await _claimOnboardingRepository.ReadAsync(id);
            return result;
        }

        public async Task<ClaimOnboardingModel> UpdateAsync(ClaimOnboardingModel claimOnboardingModel)
        {
            var result = await _claimOnboardingRepository.UpdateAsync(claimOnboardingModel);
            return result;
        }

        public async Task<ClaimOnboardingModel> DeleteAsync(int id)
        {
            var result = await _claimOnboardingRepository.DeleteAsync(id);
            return result;
        }
    }
}