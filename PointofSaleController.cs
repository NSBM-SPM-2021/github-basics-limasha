using CafeProject.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace CafeProject.Controllers
{
    public class PointofSaleController : Controller
    {
        // GET: PointofSale
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult PointofSale()
        {
            SendData();
            return View();
        }

        public JsonResult SendData()
        {
            ItemDbHandler db = new ItemDbHandler();
            List<ItemList> list = db.GetItemList();
            //var result = db.GetItemList();
            return Json(new { data = list }, JsonRequestBehavior.AllowGet);
        }
    }
}