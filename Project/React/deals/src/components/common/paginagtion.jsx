import React from "react";
import _ from "lodash";
import { Link } from "react-router-dom";
const Pagination = (props) => {
  const { itemsCount, pageSize, currentPage, onPageChange } = props;
  const pagesCount = Math.ceil(itemsCount / pageSize);
  if (pagesCount === 1) return null;
  const pages = _.range(1, pagesCount + 1);

  return (
    <nav className="flex items-center justify-center py-4">
      <ul className="pagination flex space-x-6 nm-inset-gray-200 font-semibold p-3 rounded-3xl">
        {pages.map((page) => (
          <li
            key={page}
            className={`${
              page === currentPage ? "page-item active" : "page-item"
            } nm-flat-gray-200 rounded-full focus:nm-inset-gray-200 px-2`}
          >
            <Link onClick={() => onPageChange(page)}>{page}</Link>
          </li>
        ))}
      </ul>
    </nav>
  );
};

export default Pagination;
