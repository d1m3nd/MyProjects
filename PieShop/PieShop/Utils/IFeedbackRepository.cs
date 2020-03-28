using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using ThirdProject.Models;

namespace ThirdProject.Utils
{
    public interface IFeedbackRepository
    {
        void AddFeedback(Feedback feedback);
    }
}
