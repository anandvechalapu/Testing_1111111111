using System.Threading.Tasks;
using Testingcom.DTO;

namespace Testingcom
{
    public class ClaimOnboardingRepository : IClaimOnboardingRepository
    {
        public async Task<ClaimOnboardingModel> CreateAsync(ClaimOnboardingModel claimOnboardingModel)
        {
            //TODO: Implement CreateAsync method.
            return await Task.FromResult(new ClaimOnboardingModel() { Id = claimOnboardingModel.Id });
        }

        public async Task<ClaimOnboardingModel> ReadAsync(int id)
        {
            //TODO: Implement ReadAsync method.
            return await Task.FromResult(new ClaimOnboardingModel() { Id = id });
        }

        public async Task<ClaimOnboardingModel> UpdateAsync(ClaimOnboardingModel claimOnboardingModel)
        {
            //TODO: Implement UpdateAsync method.
            return await Task.FromResult(new ClaimOnboardingModel() { Id = claimOnboardingModel.Id });
        }

        public async Task<ClaimOnboardingModel> DeleteAsync(int id)
        {
            //TODO: Implement DeleteAsync method.
            return await Task.FromResult(new ClaimOnboardingModel() { Id = id });
        }
    }
}