using System.Threading.Tasks;
using Testingcom.DTO;

namespace Testingcom.Service
{
    public interface IClaimOnboardingService
    {
        Task<ClaimOnboardingModel> CreateAsync(ClaimOnboardingModel claimOnboardingModel);
        Task<ClaimOnboardingModel> ReadAsync(int id);
        Task<ClaimOnboardingModel> UpdateAsync(ClaimOnboardingModel claimOnboardingModel);
        Task<ClaimOnboardingModel> DeleteAsync(int id);
    }
}