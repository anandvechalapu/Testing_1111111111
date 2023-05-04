using System.Threading.Tasks;
using Testingcom.DTO;
using Microsoft.AspNetCore.Mvc;

namespace Testingcom.API
{
    [ApiController]
    [Route("[controller]")]
    public class ClaimOnboardingController : ControllerBase
    {
        private readonly IClaimOnboardingService _claimOnboardingService;
        public ClaimOnboardingController(IClaimOnboardingService claimOnboardingService)
        {
            _claimOnboardingService = claimOnboardingService;
        }

        [HttpPost]
        public async Task<IActionResult> CreateAsync(ClaimOnboardingModel claimOnboardingModel)
        {
            var result = await _claimOnboardingService.CreateAsync(claimOnboardingModel);
            return Ok(result);
        }

        [HttpGet("{id}")]
        public async Task<IActionResult> ReadAsync(int id)
        {
            var result = await _claimOnboardingService.ReadAsync(id);
            return Ok(result);
        }

        [HttpPut]
        public async Task<IActionResult> UpdateAsync(ClaimOnboardingModel claimOnboardingModel)
        {
            var result = await _claimOnboardingService.UpdateAsync(claimOnboardingModel);
            return Ok(result);
        }

        [HttpDelete("{id}")]
        public async Task<IActionResult> DeleteAsync(int id)
        {
            var result = await _claimOnboardingService.DeleteAsync(id);
            return Ok(result);
        }
    }
}