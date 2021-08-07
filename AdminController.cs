using CafeProject.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace CafeProject.Controllers
{
    public class AdminController : Controller
    {
        // GET: Admin
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult Admin()
        {
            return View();
        }

        // 1. Display All Item List
        public ActionResult IndexA()
        {
            ViewBag.ItemList = "Item List Page";
            ItemDbHandler itemDbHandler = new ItemDbHandler();
            ModelState.Clear();
            return View(itemDbHandler.GetItemList());
        }

        // 2. Add New Item 
        [HttpGet]
        public ActionResult Create()
        {
            return View();
        }
        [HttpPost]
        public ActionResult Create(ItemList iList)
        {

            //if (ModelState.IsValid)
            //{
                ItemDbHandler itemDbHandler = new ItemDbHandler();
                if (itemDbHandler.InsertItem(iList))
                {
                    ViewBag.Message = "Item Added Successfully";
                    ModelState.Clear();
                }
            //}
            return View();
        }

        // 3. Update Item Details
        [HttpGet]
        public ActionResult Edit(string ID)
        {
            ItemDbHandler itemDbHandler = new ItemDbHandler();
            return View(itemDbHandler.GetItemList().Find(itemlist => itemlist.ID == ID));
        }

        [HttpPost]
        public ActionResult Edit(string ID, ItemList iList)
        {
            try
            {
                ItemDbHandler itemDbHandler = new ItemDbHandler();
                itemDbHandler.UpdateItem(iList);
                return RedirectToAction("Index");
            }
            catch { return View(); }
        }

        // 4. Delete Item Details
        public ActionResult Delete(string ID)
        {
            try
            {
                ItemDbHandler itemDbHandler = new ItemDbHandler();
                if (itemDbHandler.DeleteItem(ID))
                {
                    ViewBag.AlertMsg = "Item Deleted Successfully";
                }
                return RedirectToAction("Index");
            }
            catch { return View(); }
        }

        // 5. Disply Item according to the id
        public ActionResult Details(string ID)
        {
            ItemDbHandler itemDbHandler = new ItemDbHandler();
            return View(itemDbHandler.GetItemList().Find(itemlist => itemlist.ID == ID));
        }
    }
}